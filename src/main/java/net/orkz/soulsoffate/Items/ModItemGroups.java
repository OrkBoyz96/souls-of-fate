package net.orkz.soulsoffate.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.orkz.soulsoffate.SoulsOfFate;

public class ModItemGroups {
    public static final ItemGroup SOULS_OF_FATE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SoulsOfFate.MOD_ID, "Soul_Of_Fate_Item"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Soul_Orb))
                    .displayName(Text.translatable("itemgroup.Soul_Of_Fate.soul_orb_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.Soul_Orb));

                    } ).build());


    public static void registerItemGroups() {
        SoulsOfFate.LOGGER.info("registering item groups for " + SoulsOfFate.MOD_ID);
    }
}
