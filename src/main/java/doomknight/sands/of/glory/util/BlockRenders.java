package doomknight.sands.of.glory.util;

import doomknight.sands.of.glory.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders {

    public static void defineRenders() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACKBERRY_PLANT, RenderLayer.getCutoutMipped());
    }

}
