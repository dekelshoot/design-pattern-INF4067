package com.vehicule.api.SErvices.SocieteClienteService;

import java.util.List;

import com.vehicule.Patrons.Composite.Societe;

import io.vertx.core.Vertx;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class SocieteRessource {
    private static final Logger LOGGER = LoggerFactory.getLogger(SocieteRessource.class);

  private final SocieteClienteService societeClienteService = new SocieteClienteService();

  public Router getSubRouter(final Vertx vertx) {
    final Router subRouter = Router.router(vertx);

    // Body handler
    subRouter.route("/*").handler(BodyHandler.create());

    // Routes
    subRouter.get("/").handler(this::getAllSociete);
    subRouter.get("/:id").handler(this::getOneSociete);
    subRouter.post("/").handler(this::createOneSociete);
 
    return subRouter;
  }

  private void getAllSociete(final RoutingContext routingContext) {
    LOGGER.info("Dans getAllSociete...");

    final List<Societe> societes = societeClienteService.findAll();

    final JsonObject jsonResponse = new JsonObject();
    jsonResponse.put("Societes", societes);


    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(jsonResponse));
  }

  private void getOneSociete(final RoutingContext routingContext) {
    LOGGER.info("Dans getOneSociete...");

    final String nom = routingContext.request().getParam("id");

    final Societe societe = societeClienteService.findByName(nom);
    
    if (societe == null) {
      final JsonObject errorJsonResponse = new JsonObject();
      errorJsonResponse.put("error", "No society can be found for the specified name:" + nom);
      errorJsonResponse.put("nom", nom);

      routingContext.response()
          .setStatusCode(404)
          .putHeader("content-type", "application/json")
          .end(Json.encodePrettily(errorJsonResponse));
      return;
    }
    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(societe));
  }

  private void createOneSociete(final RoutingContext routingContext) {
    LOGGER.info("Dans createOneVehicule....");
    final JsonObject body = routingContext.getBodyAsJson();
    final String nomSociete = body.getString("nomSociete");
    final String pays = body.getString("pays");
    final String partenaires = body.getString("partenaires");
    final Societe createdSociete = societeClienteService.add(nomSociete,pays,partenaires);
    routingContext.response()
        .setStatusCode(201)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(createdSociete));
  }

}

