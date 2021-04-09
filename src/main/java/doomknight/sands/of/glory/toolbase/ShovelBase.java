package doomknight.sands.of.glory.toolbase;

import doomknight.sands.of.glory.SandsofGlory;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial material) {
        super(material, -1, -3F, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    }
    
}
