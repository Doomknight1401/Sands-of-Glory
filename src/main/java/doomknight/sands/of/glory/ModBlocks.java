package doomknight.sands.of.glory;
import doomknight.sands.of.glory.foodcrops.BlackberryPlant;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModBlocks {
    
    // Blocks
    public static final Block SILVER_ORE = new SilverOreBlock(FabricBlockSettings.of(Material.METAL).strength(5.0F, 5.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());

    public static final Block COPPER_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());

    public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(2.5F, 2.5F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());

    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 5.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());

    public static final Block COPPER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 5.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());

    public static final Block TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 5.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());

    public static final Block BRONZE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 5.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());

    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 5.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());

    public static final Block MARBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.5F, 2.5F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());

    // Crops
    public static final BlackberryPlant BLACKBERRY_PLANT = Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "blackberry_plant"), new BlackberryPlant(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0F, 0.0F).sounds(BlockSoundGroup.CROP).nonOpaque()));

    // Silver for world generation
    private static ConfiguredFeature<?, ?> SILVER_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, SILVER_ORE.getDefaultState(), 4)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 5, 80))).spreadHorizontally().repeat(14);

    // Marble for world generation
    private static ConfiguredFeature<?, ?> MARBLE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, MARBLE.getDefaultState(), 60)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 5, 80))).spreadHorizontally().repeat(10);

    // Copper for world generation
    private static ConfiguredFeature<?, ?> COPPER_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, COPPER_ORE.getDefaultState(), 6)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 5, 80))).spreadHorizontally().repeat(15);

    // Tin for world generation
    private static ConfiguredFeature<?, ?> TIN_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, TIN_ORE.getDefaultState(), 8)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 5, 80))).spreadHorizontally().repeat(15);

    public static void registerItems() {

        // Register Blocks
        // Register silver ore (Block & Item)
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "silver_ore"), SILVER_ORE);
		Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));

        // Register silver block
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "silver_block"), SILVER_BLOCK);

        // Register copper block
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "copper_block"), COPPER_BLOCK);

        // Register tin block
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "tin_block"), TIN_BLOCK);

        // Register bronze block
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "bronze_block"), BRONZE_BLOCK);

        // Register steel block
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "steel_block"), STEEL_BLOCK);

        // Register marble block & item
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "marble"), MARBLE);
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "marble"), new BlockItem(MARBLE, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));

        // Register copper ore (block & item)
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "copper_ore"), COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));

        // Register tin ore (block & item)
        Registry.register(Registry.BLOCK, new Identifier(SandsofGlory.MOD_ID, "tin_ore"), TIN_ORE);
        Registry.register(Registry.ITEM, new Identifier(SandsofGlory.MOD_ID, "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(SandsofGlory.SANDS_OF_GLORY_GROUP)));

        // Generate silver ore in the overworld
        RegistryKey<ConfiguredFeature<?,?>> silverOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(SandsofGlory.MOD_ID, "silver_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, silverOreOverworld.getValue(), SILVER_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, silverOreOverworld);

        // Generate marble in the overworld
        RegistryKey<ConfiguredFeature<?,?>> marbleOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(SandsofGlory.MOD_ID, "marble"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, marbleOverworld.getValue(), MARBLE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, marbleOverworld);

        // Generate copper ore in the overworld
        RegistryKey<ConfiguredFeature<?,?>> copperOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(SandsofGlory.MOD_ID, "copper_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, copperOreOverworld.getValue(), COPPER_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, copperOreOverworld);

        // Generate tin ore in the overworld
        RegistryKey<ConfiguredFeature<?,?>> tinOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(SandsofGlory.MOD_ID, "tin_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tinOreOverworld.getValue(), TIN_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, tinOreOverworld);
    }
}
