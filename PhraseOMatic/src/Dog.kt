package src

import java.util.*

class Dog(name: String, var weight: Double) {
    private var Name = name.uppercase(Locale.getDefault())
    var OtherWeight: Double = 0.0
        get() = weight / 1.5
        set(value) {
            if (value > 0) {
                field = value
            }
        }

}