package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class CuboidTest {
    Cuboid cuboid;
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void setUp() {
        cuboid = new Cuboid(1, 1, 1);
        System.out.println("setUp before method");
    }

    @After
    public void tearDown() {
        cuboid = null;
    }

    @Test
    public void getVolume() {
        cuboid.setHeight(1);
        cuboid.setWidth(2);
        cuboid.setLength(3);
        Assert.assertEquals(cuboid.getVolume(), 6, 0.001);
    }

}