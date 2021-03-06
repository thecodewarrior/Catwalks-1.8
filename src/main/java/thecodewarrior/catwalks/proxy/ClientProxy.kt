package thecodewarrior.catwalks.proxy

import net.minecraftforge.client.model.ModelLoaderRegistry
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent
import thecodewarrior.catwalks.model.CatwalkModelLoader

/**
 * TODO: Document file ClientProxy
 *
 * Created by TheCodeWarrior
 */
class ClientProxy : CommonProxy() {
    override fun pre(e: FMLPreInitializationEvent) {
        super.pre(e)

        ModelLoaderRegistry.registerLoader(CatwalkModelLoader)
    }

    override fun init(e: FMLInitializationEvent) {
        super.init(e)

    }

    override fun post(e: FMLPostInitializationEvent) {
        super.post(e)

    }

    @SubscribeEvent
    fun client(e: TickEvent.PlayerTickEvent) {
        if(!e.player.world.isRemote) return
        stepSoundTick(e.player)
    }

}
