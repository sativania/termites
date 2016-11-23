package jam.sativania.termites.item;

import jam.sativania.termites.Termites;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;



/**
 * Created by Q on 16.11.2016.
 */
public class ModItems {


    public static Item templateitem;   //variables for every item -> simple list, must follow this along file
    public static Item potion;
    public static Item loamframe;
    public static Item woodpulp;


    public static void itemInit() {
       loamframe = new ItemLoamFrame("loam_frame", "loam_frame");
       potion = new ItemPotion("potion", "potion");
       templateitem = new ItemTemplateItem("template_item", "template_item");
       woodpulp = new ItemWoodPulp("wood_pulp", "wood_pulp");

    }


    public static void itemRegister() {
        GameRegistry.register(loamframe);
        GameRegistry.register(potion);
        GameRegistry.register(templateitem);
        GameRegistry.register(woodpulp);
    }




    public static void registerRenders() {
        registerRender(loamframe);
        registerRender(potion);
        registerRender(templateitem);
        registerRender(woodpulp);

    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(
                item, 0, new ModelResourceLocation(
                        Termites.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"
                )
        );





    }
}




