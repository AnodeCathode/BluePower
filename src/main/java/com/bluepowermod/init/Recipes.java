/*
 * This file is part of Blue Power.
 *
 *     Blue Power is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Blue Power is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Blue Power.  If not, see <http://www.gnu.org/licenses/>
 */

package com.bluepowermod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.bluepowermod.api.BPApi;
import com.bluepowermod.api.recipe.IAlloyFurnaceRegistry;
import com.bluepowermod.recipe.CoreRecipes;
import com.bluepowermod.recipe.LightingRecipes;
import com.bluepowermod.recipe.LogicRecipes;
import com.bluepowermod.recipe.MachineRecipes;

public class Recipes {

    public static void init(CraftingManager craftManager) {

        CoreRecipes.init();
        LogicRecipes.init();
        MachineRecipes.init();
        LightingRecipes.init();

        // Alloy furnace
        IAlloyFurnaceRegistry af = BPApi.getInstance().getAlloyFurnaceRegistry();

//        af.addRecipe(new ItemStack(BPItems.red_alloy_ingot, 1), new ItemStack(Items.redstone, 4), TFCItems.wroughtIronIngot);
//        af.addRecipe(new ItemStack(BPItems.red_alloy_ingot, 1), new ItemStack(Items.redstone, 4), TFCItems.copperIngot);

//        af.addRecipe(new ItemStack(BPItems.blue_alloy_ingot, 1), new ItemStack(Items.glowstone_dust, 4), TFCItems.wroughtIronIngot);

        af.addRecipe(new ItemStack(BPItems.purple_alloy_ingot, 1), TFCItems.blueSteelIngot, TFCItems.redSteelIngot);
        //af.addRecipe(new ItemStack(BPItems.purple_alloy_ingot, 1), Items.gold_ingot, new ItemStack(BPItems.infused_teslatite_dust, 8));

        af.addRecipe(new ItemStack(BPItems.brass_ingot, 4), new ItemStack(TFCItems.copperIngot, 3), TFCItems.zincIngot);
        for (ItemStack stack : OreDictionary.getOres("blockSand")){
        	af.addRecipe(new ItemStack(BPItems.silicon_boule, 1), new ItemStack(TFCItems.coal, 8), new ItemStack(stack.getItem(), 8));
        }
        	
    	

        af.addRecipe(new ItemStack(BPItems.red_doped_wafer, 1), new ItemStack(Items.redstone, 4), BPItems.silicon_wafer);
        af.addRecipe(new ItemStack(BPItems.blue_doped_wafer, 1), new ItemStack(Items.glowstone_dust, 4), BPItems.silicon_wafer);
        af.addRecipe(new ItemStack(BPItems.zincplate, 4), new ItemStack(TFCItems.zincIngot, 1), new ItemStack(TFCItems.wroughtIronIngot, 2));

        //af.addRecyclingRecipe(new ItemStack(Blocks.iron_block), new ItemStack(TFCItems.wroughtIronIngot, 9));
        //af.addRecyclingRecipe(new ItemStack(Blocks.gold_block), new ItemStack(TFCItems.goldIngot, 9));
        af.addRecyclingRecipe(new ItemStack(TFCItems.wroughtIronIngot));
        af.addRecyclingRecipe(new ItemStack(TFCItems.goldIngot));
        af.addRecyclingRecipe(new ItemStack(Items.gold_nugget));

        af.addRecipe(new ItemStack(BPBlocks.sapphire_glass, 4), new ItemStack(Blocks.glass, 4), TFCItems.gemSapphire);
        af.addRecipe(new ItemStack(BPBlocks.reinforced_sapphire_glass, 1), new ItemStack(BPBlocks.sapphire_glass, 1), new ItemStack(
                Blocks.obsidian, 5));
    }
}
