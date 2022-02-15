package net.astronocraft.rocketscience.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.LevelAccessor;

public class CopperRocketItem extends Item {
    public CopperRocketItem(Properties pProperties) {
        super(pProperties);
    }

    //@Override
    public InteractionResult useOn(UseOnContext pContext, LevelAccessor world) {
        if(pContext.getLevel().isClientSide) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            player.sendMessage(new TranslatableComponent("Test"),
                    player.getUUID());
            //Entity entityToSpawn = new Pig(EntityType.PIG, pContext.getLevel());
            //entityToSpawn.moveTo(positionClicked.getX(), positionClicked.getX(), positionClicked.getZ());
            //world.addFreshEntity(entityToSpawn);
        }
        return super.useOn(pContext);
    }
}
