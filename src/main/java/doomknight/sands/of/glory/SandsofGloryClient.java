package doomknight.sands.of.glory;

import doomknight.sands.of.glory.util.BlockRenders;
import net.fabricmc.api.ClientModInitializer;

public class SandsofGloryClient implements ClientModInitializer {
    
    public void onInitializeClient() {
        BlockRenders.defineRenders();
    }
}
