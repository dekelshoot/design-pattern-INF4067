package com.vehicule.api.SErvices.CatalogueService;

import java.util.List;

import com.vehicule.Patrons.AbstractFactory.Vehicule;

import io.vertx.core.Vertx;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class CatalogueRessource {

  private static final Logger LOGGER = LoggerFactory.getLogger(CatalogueRessource.class);

  private final CatalogueService catalogueService = new CatalogueService();

  public Router getSubRouter(final Vertx vertx) {
    final Router subRouter = Router.router(vertx);

    // Body handler
    subRouter.route("/*").handler(BodyHandler.create());

    // Routes
    subRouter.get("/").handler(this::getAllVehicules);
    subRouter.get("/:id").handler(this::getOneVehicule);
    subRouter.post("/").handler(this::createOneVehicule);
    subRouter.put("/:id").handler(this::updateOneVehicule);
    subRouter.delete("/:id").handler(this::deleteOneVehilcule);

    return subRouter;
  }

  private void getAllVehicules(final RoutingContext routingContext) {
    LOGGER.info("Dans getAllVehicules...");

    final List<Vehicule> vehicules = catalogueService.findAll();

    final JsonObject jsonResponse = new JsonObject();
    jsonResponse.put("vehicules", vehicules);


    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(jsonResponse));
  }

  private void getOneVehicule(final RoutingContext routingContext) {
    LOGGER.info("Dans getOneVehicule...");

    final String id = routingContext.request().getParam("id");

    final Vehicule vehicule = catalogueService.findById(id);
    
    if (vehicule == null) {
      final JsonObject errorJsonResponse = new JsonObject();
      errorJsonResponse.put("error", "No vehicule can be found for the specified id:" + id);
      errorJsonResponse.put("id", id);

      routingContext.response()
          .setStatusCode(404)
          .putHeader("content-type", "application/json")
          .end(Json.encodePrettily(errorJsonResponse));
      return;
    }
    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(vehicule));
  }
  private void createOneVehicule(final RoutingContext routingContext) {
    LOGGER.info("Dans createOneVehicule....");
    final JsonObject body = routingContext.getBodyAsJson();
    final String nom = body.getString("nom");
    final String type = body.getString("type");
    final String carburation = body.getString("carburation");
    final String animations = body.getString("animations");
    final int prix = body.getInteger("prix");
    final String options = body.getString("options");
    final String images = body.getString("images");
    final Vehicule createdVehicule = catalogueService.addCreate(nom,type,carburation,options,animations,prix,images);
    routingContext.response()
        .setStatusCode(201)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(createdVehicule));
  }

  private void updateOneVehicule(final RoutingContext routingContext) {
    LOGGER.info("Dans updateOneVehicule...");
    final String id = routingContext.request().getParam("id");
    final JsonObject body = routingContext.getBodyAsJson();
    final String nom = body.getString("nom");
    final String type = body.getString("type");
    final String carburation = body.getString("carburation");
    final String animations = body.getString("animations");
    final int prix = body.getInteger("prix");
    final String options = body.getString("options");
    final String images = body.getString("images");
    // TODO Vérification des champs...
    
    final Vehicule updatedVehicule = catalogueService.update(id,nom,type,carburation,options,animations,prix,images);
    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(updatedVehicule));
  }
  
  private void deleteOneVehilcule(final RoutingContext routingContext) {
    LOGGER.info("Dans deleteOneDog...");
    final String id = routingContext.request().getParam("id");
    String id2 =catalogueService.remove(id);

    if (id2 == null) {
      final JsonObject errorJsonResponse = new JsonObject();
      errorJsonResponse.put("error", "No vehicule can be found for the specified id:" + id);
      errorJsonResponse.put("id", id);

      routingContext.response()
          .setStatusCode(404)
          .putHeader("content-type", "application/json")
          .end(Json.encodePrettily(errorJsonResponse));
      return;
    }
    
    final JsonObject JsonResponse = new JsonObject();
    JsonResponse.put("Succes", " vehicule with id:" + id2 + "has benn deleted");
    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(JsonResponse));
  }
}