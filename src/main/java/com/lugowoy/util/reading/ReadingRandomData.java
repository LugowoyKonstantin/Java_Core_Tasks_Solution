package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 27-Jan-17.
 * @author Konstantin
 * @version 1.1
 * @since 1.1
 *
 * This class implements the contract announced in the interface "ReadableRandomData"
 * and abstract contract passed by inheritance from interface "ReadableData".
 *
 * @see com.lugowoy.util.reading.ReadableData
 * @see com.lugowoy.util.reading.ReadableRandomData
 */
public class ReadingRandomData implements ReadableRandomData {
    /**
    * The method generates a random number in the range 0 to bound.
     * Override(implements) method with interface "ReadableRandomData".
     *
     * @param bound The upper limit in the generation of a random number of type integer.
     * @return Randomly generated integer value of type integer.
     * @since 1.0
    * */
    @Override
    public int readInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    /**
     * The method generates a random number.
     * Override(implements) method with interface "ReadableData".
     *
     * @return Randomly generated integer value of type integer.
     * @since 1.0
     * @throws com.lugowoy.util.reading.StoppingEnterValueException
     * When generating a random number is not thrown.
     * */
    @Override
    public int readInt() throws StoppingEnterValueException {
        return RANDOM.nextInt();
    }
    /**
     * The method generates a random number.
     * Override(implements) method with interface "ReadableData".
     *
     * @return Randomly generated double value of type double.
     * @since 1.0
     * @throws com.lugowoy.util.reading.StoppingEnterValueException
     * When generating a random number is not thrown.
     * */
    @Override
    public double readDouble() throws StoppingEnterValueException {
        return RANDOM.nextDouble();
    }
}
