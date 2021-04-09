package doomknight.sands.of.glory.toolbase;

import doomknight.sands.of.glory.SandsofGlory;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 1, -2.5F, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    }
    
}
