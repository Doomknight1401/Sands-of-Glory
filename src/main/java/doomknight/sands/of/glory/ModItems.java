package doomknight.sands.of.glory;

import doomknight.sands.of.glory.foodcrops.Blackberry;
import doomknight.sands.of.glory.foodcrops.Blueberry;
import doomknight.sands.of.glory.foodcrops.Grape;
import doomknight.sands.of.glory.foodcrops.Raspberry;
import doomknight.sands.of.glory.foodcrops.Strawberry;
import doomknight.sands.of.glory.toolbase.AxeBase;
import doomknight.sands.of.glory.toolbase.HoeBase;
import doomknight.sands.of.glory.toolbase.PickaxeBase;
import doomknight.sands.of.glory.toolbase.ShovelBase;
import doomknight.sands.of.glory.toolbase.SwordBase;
import doomknight.sands.of.glory.toolbase.ToolMaterialBronze;
import doomknight.sands.of.glory.toolbase.ToolMaterialSteel;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    // Items
    public static final Item DENARIUS = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item STATER = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));

    public static final Item SILVER_SCRAP = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
	public static final Item SILVER_NUGGET = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
	public static final Item SILVER_INGOT = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));

    public static final Item COPPER_SCRAP = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item COPPER_NUGGET = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));

    public static final Item TIN_SCRAP = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item TIN_NUGGET = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));

    public static final Item BRONZE_SCRAP = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item BRONZE_INGOT = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item BRONZE_NUGGET = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));

    public static final Item STEEL_SCRAP = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item STEEL_NUGGET = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));

    public static final Item GOLD_SCRAP = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));
    public static final Item IRON_SCRAP = new Item(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP));

    public static final Blackberry BLACKBERRY = Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "blackberry"), new Blackberry(ModBlocks.BLACKBERRY_PLANT,(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1.5F).snack().build()))));
    public static final Blueberry BLUEBERRY = Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "blueberry"), new Blueberry(ModBlocks.BLUEBERRY_PLANT,(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1.5F).snack().build()))));
    public static final Grape GRAPE = Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "grape"), new Grape(ModBlocks.GRAPE_PLANT,(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1.5F).snack().build()))));
    public static final Raspberry RASPBERRY = Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "raspberry"), new Raspberry(ModBlocks.RASPBERRY_PLANT,(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1.5F).snack().build()))));
    public static final Strawberry STRAWBERRY = Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "strawberry"), new Strawberry(ModBlocks.STRAWBERRY_PLANT,(new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1.5F).snack().build()))));

    public static void registerItems() {

        // Coins
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "denarius"), DENARIUS);
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "stater"), STATER);

        // Resources
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "silver_scrap"), SILVER_SCRAP);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "silver_nugget"), SILVER_NUGGET);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "silver_ingot"), SILVER_INGOT);

        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "copper_scrap"), COPPER_SCRAP);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "copper_nugget"), COPPER_NUGGET);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "copper_ingot"), COPPER_INGOT);

        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "tin_scrap"), TIN_SCRAP);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "tin_nugget"), TIN_NUGGET);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "tin_ingot"), TIN_INGOT);

        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_scrap"), BRONZE_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_nugget"), BRONZE_NUGGET);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_ingot"), BRONZE_INGOT);

        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_scrap"), STEEL_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_nugget"), STEEL_NUGGET);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_ingot"), STEEL_INGOT);

        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "gold_scrap"), GOLD_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "iron_scrap"), IRON_SCRAP);

        // Tools
        // Bronze
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_pickaxe"), new PickaxeBase(new ToolMaterialBronze()));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_axe"), new AxeBase(new ToolMaterialBronze()));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_hoe"), new HoeBase(new ToolMaterialBronze()));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_shovel"), new ShovelBase(new ToolMaterialBronze()));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_sword"), new SwordBase(new ToolMaterialBronze()));

        // Steel
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_pickaxe"), new PickaxeBase(new ToolMaterialSteel()));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_axe"), new AxeBase(new ToolMaterialSteel()));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_hoe"), new HoeBase(new ToolMaterialSteel()));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_shovel"), new ShovelBase(new ToolMaterialSteel()));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_sword"), new SwordBase(new ToolMaterialSteel()));

        // Block Items
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "silver_block"), new BlockItem(ModBlocks.SILVER_BLOCK, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "copper_block"), new BlockItem(ModBlocks.COPPER_BLOCK, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "tin_block"), new BlockItem(ModBlocks.TIN_BLOCK, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "bronze_block"), new BlockItem(ModBlocks.BRONZE_BLOCK, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "steel_block"), new BlockItem(ModBlocks.STEEL_BLOCK, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));
    }
}
