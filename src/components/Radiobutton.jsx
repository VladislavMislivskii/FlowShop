import React from 'react'
import "../styles/radiobutton.css"

const Radiobutton = () => {
  return (
    <><><input class="custom-radio" type="radio" id="color-10" name="color" value="indigo1" /><label for="color-10">Положение 1</label></>
    <input class="custom-radio" type="radio" id="color-11" name="color" value="indigo1" /><label for="color-11">Положение 2</label></>
  )
}

export default Radiobutton