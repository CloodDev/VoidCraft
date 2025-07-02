package clood.voidcraft.item;

import clood.voidcraft.VoidCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;


public class ModItemGroups {
    public static final ItemGroup VOIDCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VoidCraft.MOD_ID, "voidcraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.voidcraft"))
                    .icon(() -> new ItemStack(ModItems.PIECE_OF_THE_VOID)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PIECE_OF_THE_VOID);
                    }).build());

    public static void registerItemGroups() {
        VoidCraft.LOGGER.info("Registering Item Groups for " + VoidCraft.MOD_ID);
    }
}
