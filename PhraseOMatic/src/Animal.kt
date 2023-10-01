package src

open class Animal {
    protected open var image = ""
    protected open val food = ""
    protected open var habitat = ""
    protected open var hunger = 10

    open fun makeNoise() {
        println("Noise")
    }

    open fun eat() {
        println("Eat")
    }

    open fun roam() {
        println("Roam")
    }

    fun sleep() {
        println("Sleep")
    }
}

class Hippo : Animal() {
    override val food: String = "grass"
    override var image: String = "Hippo.png"
    override var habitat: String = "water"

    override fun eat() {
        println("Hippo eat $food")
    }
}

open class Canine : Animal() {
    override fun roam() {
        println("Canine roaming")
    }
}

class Wolf : Canine() {
    override var image: String = "wolf.png"
    override val food: String = "meat"
    override var habitat: String = "forest"

    override fun makeNoise() {
        println("auuuuuuuu!")
    }

    override fun eat() {
        println("wolf eat $food")
    }
}