package jam.sativania.termites.block;

import jam.sativania.termites.Termites;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by Q on 16.11.2016.
 */
public class BlockTemplate extends Block{

    public BlockTemplate(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Termites.tabTermites);
        this.setHardness(10F); //time to break 10 is high   Obsid 50
        this.setResistance(10F);  //stone is 10 , expl.resistance   Obsid 2000
        this.setSoundType(SoundType.GROUND);
    }
}
