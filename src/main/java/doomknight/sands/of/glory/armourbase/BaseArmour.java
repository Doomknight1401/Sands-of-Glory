package doomknight.sands.of.glory.armourbase;

import doomknight.sands.of.glory.SandsofGlory;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class BaseArmour extends ArmorItem {

    public BaseArmour(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    }
    
}
