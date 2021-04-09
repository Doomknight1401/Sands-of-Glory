package doomknight.sands.of.glory.toolbase;

import doomknight.sands.of.glory.SandsofGlory;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -3F, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    }
    
}
