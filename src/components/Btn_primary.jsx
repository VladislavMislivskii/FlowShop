import React from 'react'
import '../styles/btn_primary.css'

const Btn_primary = (props) => {
  return (
    <button class="btn-primary" href='#'>{props.value}</button>
  )
}

export default Btn_primary