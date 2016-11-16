package jam.sativania.termites.block;

import jam.sativania.termites.Termites;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Q on 16.11.2016.
 */
public class ModBlocks {


    public static Block driedDirt;
    public static Block loam;
    public static Block template;

    public static void inpreInit(){              //method needs to be called in preInit

        //inside
        driedDirt = new BlockDriedDirt(Material.GROUND, "dirt_dried");
        loam = new BlockLoam(Material.GROUND, "loam");
        template = new BlockTemplate(Material.ROCK, "template");

        //end

        registerBlocks();    //called from below definition GameReg.

    }

    public static void registerBlocks()  {  //packs blockform and itemform of blocks into one
        registerBlock(driedDirt, "dirt_dried");
        registerBlock(template, "template");
        registerBlock(loam, "loam");


    }


    public static void registerBlock(Block block, String name) {
        GameRegistry.register(block, new ResourceLocation(Termites.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(Termites.MODID, name));



    }

    public static void registerRenders() {
        registerRender(driedDirt);
        registerRender(loam);
        registerRender(template);
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Termites.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}



