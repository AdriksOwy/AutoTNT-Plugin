package org.apache.maven.plugins.Customs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CustomTNT {

    public static ItemStack tnt;

    public static void init() {
        createBomb();
    }

    private static void createBomb() {
        ItemStack item = new ItemStack(Material.TNT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§lBomba");

        List<String> lore = new ArrayList<>();
        lore.add("§7Opis itemku!");

        meta.setLore(lore);
        item.setItemMeta(meta);
        tnt = item;

        ShapedRecipe bomb = new ShapedRecipe(NamespacedKey.minecraft("tnt_special"), item);
        bomb.shape(" 1 ", " 1 ", " 2 ");

        bomb.setIngredient('1', Material.GRAVEL);
        bomb.setIngredient('2', Material.REDSTONE);
        Bukkit.getServer().addRecipe(bomb);
    }
}
