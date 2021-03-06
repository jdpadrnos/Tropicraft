package net.tropicraft.factory;

import net.minecraft.tileentity.TileEntity;
import net.tropicraft.block.tileentity.TileEntityAirCompressor;
import net.tropicraft.block.tileentity.TileEntityBambooChest;
import net.tropicraft.block.tileentity.TileEntityBambooMug;
import net.tropicraft.block.tileentity.TileEntityCurareBowl;
import net.tropicraft.block.tileentity.TileEntityFirePit;
import net.tropicraft.block.tileentity.TileEntitySifter;
import net.tropicraft.block.tileentity.TileEntityTropicraftFlowerPot;

/**
 * Class to get TileEntity instances for Tropicraft. Should make updating a little less painful having
 * things in one place. Idk. Maybe. :)
 */
public class TileEntityFactory {

    public static TileEntity getAirCompressorTE() {
        return new TileEntityAirCompressor();
    }

    public static TileEntity getBambooChestTE() {
        return new TileEntityBambooChest();
    }
    
    public static TileEntity getBambooMugTE() {
        return new TileEntityBambooMug();
    }

    public static TileEntity getCurareBowlTE() {
        return new TileEntityCurareBowl();
    }

    public static TileEntity getFirePitTE() {
        return new TileEntityFirePit();
    }

    public static TileEntity getFlowerPotTE() {
        return new TileEntityTropicraftFlowerPot();
    }

    public static TileEntity getSifterTE() {
        return new TileEntitySifter();
    }
}
