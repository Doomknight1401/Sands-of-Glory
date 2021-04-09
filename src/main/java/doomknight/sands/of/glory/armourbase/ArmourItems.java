package doomknight.sands.of.glory.armourbase;

import doomknight.sands.of.glory.SandsofGlory;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmourItems {
    
    public static final ArmorMaterial BRONZE_ARMOUR = new BronzeArmourMaterial();
    public static final ArmorMaterial STEEL_ARMOUR = new SteelArmourMaterial();

    public static void registerItems() {

        // Bronze armour
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_helmet"), new BaseArmour(BRONZE_ARMOUR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_chestplate"), new BaseArmour(BRONZE_ARMOUR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_leggings"), new BaseArmour(BRONZE_ARMOUR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_boots"), new BaseArmour(BRONZE_ARMOUR, EquipmentSlot.FEET));

        // Steel armour
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_helmet"), new BaseArmour(STEEL_ARMOUR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_chestplate"), new BaseArmour(STEEL_ARMOUR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_leggings"), new BaseArmour(STEEL_ARMOUR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_boots"), new BaseArmour(STEEL_ARMOUR, EquipmentSlot.FEET));
    }
}
