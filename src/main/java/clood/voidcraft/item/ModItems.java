package clood.voidcraft.item;

import clood.voidcraft.VoidCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class ModItems {
    public static final Item PIECE_OF_THE_VOID = registerItem("piece_of_the_void", 
        new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        try {
            return Registry.register(Registries.ITEM, new ResourceLocation(VoidCraft.MOD_ID, name), item);
        } catch (Exception e) {
            VoidCraft.LOGGER.error("Failed to register item: " + name, e);
            throw e;
        }
    }

    public static void registerModItems() {
        VoidCraft.LOGGER.info("Registering Mod Items for " + VoidCraft.MOD_ID);
    }
}
