import React from 'react'
import "../styles/btn_secondary.css"

const Btn_secondary_disabled = (props) => {
  return (
    <button class = "btn-secondary" disabled>{props.value}</button>
  )
}

export default Btn_secondary_disabled