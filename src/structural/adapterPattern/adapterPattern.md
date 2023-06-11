## Java Design Pattern

## 어댑터 패턴(Adapter Pattern)

어댑터 패턴은 기존 코드를 재사용하기 위해 내적, 외적 구조를 변환하는 작업을 처리한다.

어댑터 패턴은 코드를 재사용하기 위한 인터페이스를 처리하고 인터페이스를 활용해 보정 코드를 사용한다.

어댑터 패턴은 기능상 문제없이 동작하는 코드가 단지 인터페이스 차이 때문에 사용할 수 없는 경우 많이 응용되는 패턴이다. 또 기존 코드에 오류가 있거나 보정 작업이 필요한 경우에도 유용하다.

어댑터 패턴은 오래된 레거시 코드나 라이브러리를 재사용할 때 유용한 패턴이다. 또한 어댑터 패턴은 서로 호환되지 않는 인터페이스를 가진 코드를 결함 하여 응용 프로그램에서 동작할 수 있도록 도와준다.

![Adapter](https://github.com/parknnna/designPattern/assets/69619672/8cfb330c-242d-4327-8035-37250112cb09)

*AdapterPatternTest.java*

```java
package structural.adapterPattern;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterPatternTest {
    @Test
    void adapterPatternTest() throws CloneNotSupportedException {

        byte[] imageBytes = "변환할 이미지 정보의 스트림".getBytes(StandardCharsets.UTF_8);
        RGB rgb = new RGB();
        rgb.setImages(imageBytes);

        // when
        HDMIConverter hdmiConverter = new HDMIConverter();
        HDMI hdmi = hdmiConverter.convertRGBToHDMI(rgb);

        // then
        assertEquals(hdmi.getImages(), imageBytes);

    }
}

```

*HDMI.java*

```java
package structural.adapterPattern;

public class HDMI {

    private byte[] images;

    public HDMI(byte[] images) {
        this.images = images;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

}
```

*RGB.java*

```java
package structural.adapterPattern;

public class RGB {

    private byte[] images;

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

}

```

*Adapter.java*

```java
package structural.adapterPattern;

public interface Adapter {
    HDMI convertRGBToHDMI(RGB rgb);
}

```

*HDMIConverter.java*

```java
package structural.adapterPattern;

public class HDMIConverter implements Adapter {

    @Override
    public HDMI convertRGBToHDMI(RGB rgb) {
        return new HDMI(rgb.getImages());
    }

}

```

