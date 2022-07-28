package hiber.model;
import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    public Car() {
    }

    public Car(String model, int series) { this.model = model; this.series = series; }

    public void setId(Long id) { this.id = id; }

    public Long getId() { return id; }

    public void setModel(String model) { this.model = model; }

    public String getModel() { return model; }

    public void setSeries(int series) { this.series = series; }

    public int getSeries() { return series; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    @Override
    public String toString() {
        return "Car model = " + model + " series = " + series + "\n";
    }
}

