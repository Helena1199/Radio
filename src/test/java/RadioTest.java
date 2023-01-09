import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //Радиостанции

    @Test //граничное значение -1 для установки пользователем

    public void shouldSetStationMinus1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 0 для установки пользователем

    public void shouldSetStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 1 для установки пользователем

    public void shouldSetStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 8 для установки пользователем

    public void shouldSetStation8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 9 для установки пользователем

    public void shouldSetStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 10 для установки пользователем

    public void shouldSetStation10() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // значение 00 для установки пользователем

    public void shouldSetStation00() {
        Radio radio = new Radio();
        radio.setCurrentStation(00);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // значение 5 для установки пользователем

    public void shouldSetStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // значение 20 для установки пользователем

    public void shouldSetStation20() {
        Radio radio = new Radio();
        radio.setCurrentStation(20);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // значение -20 для установки пользователем

    public void shouldSetStationMinus20() {
        Radio radio = new Radio();
        radio.setCurrentStation(-20);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test //граничное значение 0 для переключения +

    public void shouldSetNextStationFrom0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 1 для переключения +

    public void shouldSetNextStationFrom1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 8 для переключения +

    public void shouldSetNextStationFrom8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 9 для переключения +

    public void shouldNotSetNextStationFrom9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test //граничное значение 0 для переключения -

    public void shouldSetPrevStationFrom0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 1 для переключения -

    public void shouldSetPrevStationFrom1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 8 для переключения -

    public void shouldSetPrevStationFrom8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 9 для переключения -

    public void shouldNotSetPrevStationFrom9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    //Громкость
    @Test //граничное значение 0 для увеличения громкости

    public void shouldSetIncreaseVolumeFrom0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 1 для увеличения громкости

    public void shouldSetIncreaseVolumeFrom1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 9 для увеличения громкости

    public void shouldSetIncreaseVolumeFrom9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 10 для увеличения громкости

    public void shouldNotSetIncreaseVolumeFrom10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test //граничное значение 0 для уменьшения громкости

    public void shouldSetDecreaseVolumeFrom0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume ();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 1 для уменьшения громкости

    public void shouldSetDecreaseVolumeFrom1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume ();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 9 для уменьшения громкости

    public void shouldSetDecreaseVolumeFrom9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.decreaseVolume ();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //граничное значение 10 для уменьшения громкости

    public void shouldSetDecreaseVolumeFrom10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.decreaseVolume ();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
