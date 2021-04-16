package lambdaschool.javazoo.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ZooAnimalId implements Serializable {
    private long zoo;
    private long animal;

    public ZooAnimalId()
    {
    }

    public ZooAnimalId(
            long zoo,
            long animal)
    {
        this.zoo = zoo;
        this.animal = animal;
    }

    public long getAnimal()
    {
        return animal;
    }

    public void setAnimal(long animal)
    {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof ZooAnimalId))
        {
            return false;
        }

        ZooAnimalId that = (ZooAnimalId) o;
        return (this.zoo == that.zoo) &&
                (this.animal == that.animal);

    }

    @Override
    public int hashCode()
    {
        return 37;
    }
}
