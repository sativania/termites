//bla alt+insert> constructor     strg+o Override   strg+i Implement


package jam.sativania.termites;

import jam.sativania.termites.block.ModBlocks;
import jam.sativania.termites.item.ModItems;
import jam.sativania.termites.proxy.ClientProxy;
import jam.sativania.termites.proxy.CommonProxy;
import jam.sativania.termites.tab.CreativeTabTermites;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Termites.MODID, version = Termites.VERSION, name =Termites.NAME )


public class Termites
{
    public static final String MODID = "termites";
    public static final String VERSION = "0.1";
    public static final String NAME = "Termites";

    @SidedProxy(clientSide = "jam.sativania.termites.proxy.ClientProxy", serverSide = "jam.sativania.termites.proxy.CommonProxy")
    public static CommonProxy proxy;


    @Mod.Instance
    public static Termites instance;
    public static CreativeTabTermites tabTermites;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("Termites are coming! ");

        tabTermites = new CreativeTabTermites(CreativeTabs.getNextID(), "tab_termites");

        ModItems.itemregister();
        ModBlocks.inpreInit();

        proxy.preInit(event);
        System.out.println("Termites are arriving! ");                                                                  //+Blocks.DIRT.getUnlocalizedName());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        System.out.println("Termites are here! ");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
        System.out.println("Termites have been here");
    }
}
