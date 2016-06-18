package fossilsarcheology.server.entity.mob;

import fossilsarcheology.server.entity.mob.test.EntityFishBase;
import fossilsarcheology.server.enums.EnumPrehistoric;
import net.minecraft.world.World;

public class EntityCoelacanth extends EntityFishBase {
    public EntityCoelacanth(World par1World) {
        super(par1World, EnumPrehistoric.Coelacanth);
        this.setSize(1.9F, 1F);
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < 35.0D && super.getCanSpawnHere();
    }

    @Override
    public String getTexture() {
        return "fossil:textures/model/fish/coelacanth.png";
    }

    @Override
    protected double getSwimSpeed() {
        return 0.35D;
    }

}