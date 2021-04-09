package doomknight.sands.of.glory.toolbase;

import doomknight.sands.of.glory.SandsofGlory;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {

    public HoeBase(ToolMaterial material) {
        super(material, -3, -2F, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    }
    
}
