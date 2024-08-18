package net.ztn.agriculturalmysticism.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ztn.agriculturalmysticism.AgriculturalMysticism;

public class ModItems {
    public static final Item CRAFTING_ESSENCE = registerItem("crafting_essence", new Item(new FabricItemSettings()));
    public static final Item IRON_COMPOUND = registerItem("iron_compound", new Item(new FabricItemSettings()));
    public static final Item CRAFTING_SEEDS = registerItem("crafting_seeds", new Item(new FabricItemSettings()));

    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CRAFTING_ESSENCE);
        entries.add(IRON_COMPOUND);
    }

    public static void addItemsToNaturalBlocksTabItemGroup(FabricItemGroupEntries entries){
        entries.add(CRAFTING_SEEDS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AgriculturalMysticism.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AgriculturalMysticism.LOGGER.info("Registering Mod Items for" + AgriculturalMysticism.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalBlocksTabItemGroup);

    }

}
