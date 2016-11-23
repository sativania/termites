package jam.sativania.termites.block;

import jam.sativania.termites.Termites;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Q on 16.11.2016.
 */
public class ModBlocks {


    public static Block driedDirt;
    public static Block loam;
    public static Block template;

    public static void blockInit(){              //method needs to be called in preInit

        //inside
        driedDirt = new BlockDriedDirt(Material.GROUND, "dirt_dried");
        loam = new BlockLoam(Material.GROUND, "loam");
        template = new BlockTemplate(Material.ROCK, "template");





    }

    public static void blockRegister()  {  //packs blockform and itemform of blocks into one
        registerBlock(driedDirt);
        registerBlock(template);
        registerBlock(loam);


    }


    public static void registerBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));




    }

    public static void registerRenders() {
        registerRender(driedDirt);
        registerRender(loam);
        registerRender(template);
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                        new ResourceLocation(Termites.MODID, block.getUnlocalizedName().substring(5)), "inventory"
                )
        );



    }

}



