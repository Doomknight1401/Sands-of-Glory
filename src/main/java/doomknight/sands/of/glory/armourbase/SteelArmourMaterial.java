package doomknight.sands.of.glory.armourbase;

import doomknight.sands.of.glory.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SteelArmourMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {16, 19, 21, 15};
    private static final int[] PROTECTION_AMOUNTS = new int[] {4, 7, 8, 4};

    @Override
    public int getDurability(EquipmentSlot slot) {
        // Multiplier by choice
        return BASE_DURABILITY[slot.getEntitySlotId()]*25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_AMOUNTS[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.STEEL_INGOT);
    }

    @Override
    public String getName() {
        return "steel";
    }

    @Override
    public float getToughness() {
        return 2;
    }

    @Override
    public float getKnockbackResistance() {
        return 1;
    }
    
}
