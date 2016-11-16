package jam.sativania.termites.proxy;

import jam.sativania.termites.block.ModBlocks;
import jam.sativania.termites.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Q on 16.11.2016.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {



    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();
        ModBlocks.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
