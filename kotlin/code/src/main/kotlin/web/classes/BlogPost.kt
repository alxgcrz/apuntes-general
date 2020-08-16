package web.classes

import java.net.URI
import java.util.*

data class BlogPost(var title: String, var url: URI, var description: String, var publishDate: Date)