package itsaslan.agaric.main;

import cpw.mods.fml.common.registry.GameRegistry;
import itsaslan.agaric.tileentity.fungi.TileEntityWhiteFungi;

public class RegisterTileEntity
{
    public static void MainRegistry()
    {
        GameRegistry.registerTileEntity(TileEntityWhiteFungi.class, "TileEntityWhiteFungi");
    }
}
