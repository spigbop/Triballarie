package net.xpoxy.triballarie.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class GoblinEntity extends PathAwareEntity implements Angerable {

    @Nullable
    private UUID AngryAt;

    public GoblinEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new TemptGoal(this, 1.25D, Ingredient.ofItems(Items.GLOW_BERRIES), true));
        //this.goalSelector.add(2, new FollowParentGoal(this, 1.15D));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1D));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1D));
    }

    public static DefaultAttributeContainer.Builder createGoblinAttiributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 12)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.4f)
                .add(EntityAttributes.GENERIC_ARMOR, 0.3f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3);
    }

    // Baby Goblin
    //@Override
    //public HostileEntity createChild(ServerWorld world, HostileEntity entity) {
    //	return null;
    //}

    @Override
    public int getAngerTime() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setAngerTime(int var1) {
        // TODO Auto-generated method stub

    }

    @Override
    public UUID getAngryAt() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setAngryAt(UUID var1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void chooseRandomAngerTime() {
        // TODO Auto-generated method stub

    }
}
