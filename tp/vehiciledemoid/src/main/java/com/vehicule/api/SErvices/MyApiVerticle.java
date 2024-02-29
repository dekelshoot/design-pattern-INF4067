package com.vehicule.api.SErvices;

import com.vehicule.api.SErvices.CatalogueService.CatalogueRessource;
import com.vehicule.api.SErvices.CommandeService.CommandeRessource;
import com.vehicule.api.SErvices.SocieteClienteService.SocieteRessource;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;

public class MyApiVerticle extends AbstractVerticle {
  private static final Logger LOGGER = LoggerFactory.getLogger(MyApiVerticle.class);
  @Override
  public void start() throws Exception {
    LOGGER.info("Dans le start...");
    final Router router = Router.router(vertx);

    final CatalogueRessource catalogueRessource = new CatalogueRessource();
    final SocieteRessource societeRessource = new SocieteRessource();
    final CommandeRessource commandeRessource = new CommandeRessource();

    final Router catalogueSubRouter = catalogueRessource.getSubRouter(vertx);
    final Router societeSubRouter = societeRessource.getSubRouter(vertx);
    final Router commandeSubRouter = commandeRessource.getSubRouter(vertx);

    router.mountSubRouter("/api/v1/catalogue", catalogueSubRouter);
    router.mountSubRouter("/api/v1/societe", societeSubRouter);
    router.mountSubRouter("/api/v1/commande", commandeSubRouter);

    vertx.createHttpServer()
        .requestHandler(router)
        .listen(8080);
  }
  @Override
  public void stop() throws Exception {
    LOGGER.info("Dans le stop...");
  }
}