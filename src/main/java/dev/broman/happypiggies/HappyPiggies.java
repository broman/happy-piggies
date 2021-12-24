package dev.broman.happypiggies;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HappyPiggies implements ModInitializer {

  public static Logger LOGGER = LogManager.getLogger("Happy Piggies");

  @Override
  public void onInitialize() {
    LOGGER.info("Server init!");
  }
}
