public class Car extends MotorTransport{
    @Override
    public void service(){
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
