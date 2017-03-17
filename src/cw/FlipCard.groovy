package cw

import java.io.Serializable

class FlipCard implements Serializable
{
	def id
	def vPoint
	
	public FlipCard(vPoint, id){
		this.vPoint = vPoint
		this.id = id
	}
}
