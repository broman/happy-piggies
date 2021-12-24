package dev.broman.happypiggies.client;

import dev.broman.happypiggies.HappyPiggies;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class HappyPiggiesClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    HappyPiggies.LOGGER.info("Client init!");
  }
}
