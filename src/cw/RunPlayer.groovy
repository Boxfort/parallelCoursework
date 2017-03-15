package cw

import org.jcsp.awt.*
import org.jcsp.lang.*
import org.jcsp.util.*
import org.jcsp.groovy.*

player = new Player ("127.0.0.2")

new PAR ([player]).run()