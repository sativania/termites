package jam.sativania.termites.item;

import jam.sativania.termites.Termites;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;


/**
 * Created by Q on 16.11.2016.
 */
public class ModItems {


    public static Item templateitem;   //variables for every item -> simple list, must follow this along file
    public static Item potion;
    public static Item frame;
    public static Item woodpulp;


    public static void itemregister() {
        inpreInit(templateitem, "template_item");
        inpreInit(potion, "potion");
        inpreInit(frame, "frame");
        inpreInit(woodpulp, "wood_pulp");



    }


    public static void inpreInit(Item item, String name) {              //method needs to be called in preInit

        item = new Item().setUnlocalizedName(name).setCreativeTab(Termites.tabTermites);





        //inside
        //vorher:
        //templateitem = new Item().setUnlocalizedName("template_item").setCreativeTab(Termites.tabTermites);
        //potion = new Item().setUnlocalizedName("potion").setCreativeTab(Termites.tabTermites);
        //frame = new Item().setUnlocalizedName("frame").setCreativeTab(Termites.tabTermites);
        //woodpulp = new Item().setUnlocalizedName("pulp_wood").setCreativeTab(Termites.tabTermites);


        registerItems(item, name);    //called from below definition GameReg.

    }

    public static void registerItems(Item item, String name)  {
        GameRegistry.register(item, new ResourceLocation(Termites.MODID, name));
    }

    public static void registerRenders() {
        //registerRender(templateitem);
        //registerRender(potion);
        //registerRender(frame);
        //registerRender(woodpulp);
    }

    public static void registerRender(Item item) {

       Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Termites.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }



}



