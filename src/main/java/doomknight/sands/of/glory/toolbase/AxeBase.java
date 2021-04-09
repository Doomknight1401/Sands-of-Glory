package doomknight.sands.of.glory.toolbase;

import doomknight.sands.of.glory.SandsofGlory;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial material) {
        super(material, 3, -3.1F, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    }
    
}
