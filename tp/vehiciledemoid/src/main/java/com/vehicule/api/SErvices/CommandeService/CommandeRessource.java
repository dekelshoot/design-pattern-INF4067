package com.vehicule.api.SErvices.CommandeService;

import java.util.List;


import com.vehicule.Patrons.FactoryMethod.Commande;
import com.vehicule.Patrons.Singleton.LiassViergeDocuments;

import io.vertx.core.Vertx;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class CommandeRessource {

  private static final Logger LOGGER = LoggerFactory.getLogger(CommandeRessource.class);

  private final CommandeService commandeService = new CommandeService();

  public Router getSubRouter(final Vertx vertx) {
    final Router subRouter = Router.router(vertx);

    // Body handler
    subRouter.route("/*").handler(BodyHandler.create());

    // Routes
    subRouter.get("/").handler(this::getAllCommande);
    subRouter.get("/:id").handler(this::getOneCommande);
    subRouter.post("/").handler(this::createOneCommande);
    subRouter.put("/:id").handler(this::updateOneCommande);
    subRouter.put("/etat/:id").handler(this::updateOneCommandeState);
    subRouter.get("/documents/").handler(this::getAllLiassDocument);
    subRouter.get("/documents/:id").handler(this::getOneLiassDocument);
    // subRouter.delete("/:id").handler(this::deleteOneCommande);

    return subRouter;
  }

  private void getAllCommande(final RoutingContext routingContext) {
    LOGGER.info("Dans getAllCommande...");

    final List<Commande> commandes = commandeService.findAll();

    final JsonObject jsonResponse = new JsonObject();
    jsonResponse.put("commandes", commandes);


    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(jsonResponse));
  }

  private void getOneCommande(final RoutingContext routingContext) {
    LOGGER.info("Dans getOneCommande...");

    final String id = routingContext.request().getParam("id");

    final Commande commande = commandeService.findById(id);
    
    if (commande == null) {
      final JsonObject errorJsonResponse = new JsonObject();
      errorJsonResponse.put("error", "No command can be found for the specified id:" + id);
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
        .end(Json.encodePrettily(commande));
  }

  private void createOneCommande(final RoutingContext routingContext) {
    LOGGER.info("Dans createOneCommande....");
    final JsonObject body = routingContext.getBodyAsJson();
    final String nomSociete = body.getString("nomSociete");
    final String type = body.getString("type");
    final String vehicules = body.getString("vehicules");

    final Commande createdCommande = commandeService.add(nomSociete,vehicules,type);
    routingContext.response()
        .setStatusCode(201)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(createdCommande));
  }

  private void updateOneCommande(final RoutingContext routingContext) {
    LOGGER.info("Dans updateOneCommande...");
    final String id = routingContext.request().getParam("id");
    final JsonObject body = routingContext.getBodyAsJson();
    final String nomSociete = body.getString("nomSociete");
    final String type = body.getString("type");
    final String vehicules = body.getString("vehicules");
    // TODO Vérification des champs...
    
    final Commande updatedCommande = commandeService.update(id,nomSociete,vehicules,type);
    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(updatedCommande));
  }

  private void updateOneCommandeState(final RoutingContext routingContext) {
    LOGGER.info("Dans updateOneCommandeState...");
    final String id = routingContext.request().getParam("id");
    final JsonObject body = routingContext.getBodyAsJson();
    final String etat = body.getString("etat");
    
    
    final Commande updatedCommande = commandeService.updateState(id,etat);
    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(updatedCommande));
  }

  private void getAllLiassDocument(final RoutingContext routingContext) {
    LOGGER.info("Dans getAllLiassDocument...");

    final List<LiassViergeDocumentsPublic> liassViergeDocuments = commandeService.findAllLiassDocuments();
    final JsonObject jsonResponse = new JsonObject();

    jsonResponse.put("LiassDocumment", liassViergeDocuments);
    System.out.println("1S");
    System.out.println(jsonResponse.getValue("LiassDocumment"));

    routingContext.response()
        .setStatusCode(200)
        .putHeader("content-type", "application/json")
        .end(Json.encodePrettily(jsonResponse));
  }

  private void getOneLiassDocument(final RoutingContext routingContext) {
    LOGGER.info("Dans getOneLiassDocument...");

    final String id = routingContext.request().getParam("id");

    final LiassViergeDocuments liassViergeDocuments = commandeService.findLiassDocumentById(id);
    liassViergeDocuments.afficherLiassDocument();
    if (liassViergeDocuments == null) {
      final JsonObject errorJsonResponse = new JsonObject();
      errorJsonResponse.put("error", "No liassDocument can be found for the specified id:" + id);
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
        .end(Json.encodePrettily(liassViergeDocuments));
  }

  
  
}