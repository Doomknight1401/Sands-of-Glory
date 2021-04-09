package doomknight.sands.of.glory;

import doomknight.sands.of.glory.armourbase.ArmourItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class SandsofGlory implements ModInitializer {

	public static final String MOD_ID = "sandsofglory";

	public static final ItemGroup SANDS_OF_GLORY_GROUP = FabricItemGroupBuilder.build(
		new Identifier(MOD_ID, "soggroup"),
		() -> new ItemStack(ModItems.DENARIUS));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerItems();
		ArmourItems.registerItems();
	}
}
