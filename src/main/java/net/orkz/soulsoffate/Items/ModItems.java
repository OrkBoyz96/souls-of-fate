package net.orkz.soulsoffate.Items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.orkz.soulsoffate.SoulsOfFate;


public class ModItems {

    public static final Item Soul_Orb = registerItem("soul_orb", new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.of(SoulsOfFate.MOD_ID, name), item );

    }


    public static void registerItems() {
        SoulsOfFate.LOGGER.info("Registering Mod Items for " + SoulsOfFate.MOD_ID);
    }
}
