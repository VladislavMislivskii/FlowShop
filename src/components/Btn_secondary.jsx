import React from 'react'
import "../styles/btn_secondary.css"

const Btn_secondary = (props) => {
  return (
    <button class = "btn-secondary">{props.value}</button>
  )
}

export default Btn_secondary