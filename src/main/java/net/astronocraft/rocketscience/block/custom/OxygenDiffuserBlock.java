package net.astronocraft.rocketscience.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class OxygenDiffuserBlock extends Block {
    public OxygenDiffuserBlock(Properties properties) {
        super(properties);
    }

    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity, UseOnContext pContext) {
        if (!pLevel.isClientSide()) {
            Player player = pContext.getPlayer();
            Level block = pContext.getLevel();

            //if (getDistanceToEntity(player, BlockPos) < 10) {
            //    player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 20, 1));
            //}

            if (pEntity instanceof LivingEntity) {
                LivingEntity entity = ((LivingEntity) pEntity);
                entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 1));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    public static double getDistanceToEntity(Entity player, BlockPos pos) {
        double deltaX = player.getX() - pos.getX();
        double deltaY = player.getY() - pos.getY();
        double deltaZ = player.getZ() - pos.getZ();

        return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY) + (deltaZ * deltaZ));
    }
}
